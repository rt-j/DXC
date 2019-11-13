import React, { Component } from 'react'
import ProductDataService from '../service/ProductDataService'

class ListProductComponent extends Component {
    constructor(props) {
        super(props)
        this.deleteButtonClicked=this.deleteButtonClicked.bind(this);
        this.refresh=this.refresh.bind(this);
        this.update=this.update.bind(this);
        this.addProduct=this.update.bind(this);

        this.state = {
                 products:[],
                 message:''
        }
    }
    componentWillMount(){
       this.refresh();
    }
    refresh(){
        ProductDataService.getAllProducts().then(
            response=>{
                this.setState({
                    products:response.data
                })
            }
        )
    }
    deleteButtonClicked(productIdToDelete){
        ProductDataService.deleteProduct(productIdToDelete).then(response=>
            {
                this.setState({
                        message:'Deleted Product'

                })
                this.refresh()
            }
            )
    }
    update(productIdToUpdate){
        this.props.history.push(`/product/${productIdToUpdate}`)
    }
    addProduct(p){

    }

    render() {
        return (
            <div>
                {this.state.message&&<div className="alert alert-success">{this.state.message}</div>}
                <h1>MY Product</h1>
                <div className="container">
                    <table className="table">
                        <thead>
                            <tr>
                                <td>ProductId</td>
                                <td>ProductName</td>
                                <td>Quantity</td>
                                <td>Price</td>
                                <td>Delete</td>
                                <td>Update</td>
                                <td>Add</td>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.products.map(product=>
                                    <tr key={product.productId}>
                                        <td>{product.productId}</td>
                                        <td>{product.productName}</td>
                                        <td>{product.quantityOnHand}</td>
                                        <td>{product.price}</td>
                                        <td>
                                            <button className="btn btn-danger" onClick={()=>this.deleteButtonClicked(product.productId)}>
                                                Delete
                                            </button>
                                        </td>
                                        <td>
                                            <button className="btn btn-success" onClick={()=>this.update(product.productId)}>
                                                Update
                                            </button>
                                        </td>
                                        <td>
                                            <button className="btn btn-success" onClick={()=>this.add(product.productId)}>
                                                Add
                                            </button>
                                        </td>
                                    </tr>
                                    
                                    )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

export default ListProductComponent
