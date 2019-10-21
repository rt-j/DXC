import React, { Component } from 'react'
import ProductDisplay from './ProductDisplay'

class ProductList extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
        
    }

    render() {
        const productList=[
            {
                productId:1,
                productName:"A",
                quantity:3,
                price:5678
            },
            {
                productId:2,
                productName:"B",
                quantity:567,
                price:5678
            },
            {
                productId:3,
                productName:"C",
                quantity:123,
                price:5678
            }
        ]
        return (
            <div>
                {productList.map((a,index)=>//index always iterates or put key={a.productId}
                
                   <ProductDisplay nn={index} p={a} key={index} />
                    )}
                    
            </div>
        )
    }
}

export default ProductList
