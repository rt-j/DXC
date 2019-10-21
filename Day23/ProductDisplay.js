import React, { Component } from 'react'

class ProductDisplay extends Component {
   
    constructor(props) {
        super(props)
        
        this.state = {
                 
        }
    }

    render() {
        const {nn,p}=this.props
        return (
            <div>
                <h2>Key:{nn}</h2>
                 <h3>ProductId:{p.productId}
                    ProductName:{p.productName}
                    quantity:{p.quantity}
                    Price:{p.price}
                    </h3>
            </div>
        );
    }
}

export default ProductDisplay
