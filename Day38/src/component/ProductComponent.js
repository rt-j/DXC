import React, { Component } from 'react'
import ProductDataService from '../service/ProductDataService'

class ProductComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 productId:this.props.match.params.pId,
                 productName:'',
                 quantityOnHand:'',
                 price:''
        }
    }
    componentWillMount(){
        ProductDataService.getProduct(this.state.productId).then(
            response=>{
                this.setState({
                    productName:response.data.productName,
                    quantityOnHand:response.data.quantityOnHand,
                    price:response.data.price
                })
            }
        )
    }

    render() {
        return (
            <div>
               <h1>Add and Update Product {this.state.productId}</h1> 
               <h1>Product Name:{this.state.productName}</h1>
               <h1>{this.state.quantityOnHand}</h1>
               <h1>{this.state.price}</h1>
            </div>
        )
    }
}

export default ProductComponent
