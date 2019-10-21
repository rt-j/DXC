import React, { Component } from 'react'
import './App.css'

class App1 extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div className="mydiv">
                <a href="home">home</a>||
                <a href="customers">Customers</a>||
                <a href="prd">ProductDetails</a>||
                <a href="employees">employess</a>
            </div>
        )
    }
}

export default App1
