import React, { Component } from 'react'

class Forms extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 value:"H",
                 msg:""
        }
        this.handlechange=this.handlechange.bind(this)
        this.takeInput=this.takeInput.bind(this)
    }
    handlechange(ourdata){
        this.setState({
            value:ourdata.target.value
        })
    }
     takeInput(a){
        this.setState({
            msg:this.state.value
        })
        a.preventDefault();
    } 

    render() {
        return (
            <div>
                <h1>Kicker</h1>
                <form control="form-group" onSubmit={this.takeInput} >
                    Username:
                    <input type="text" value={this.state.value} name="Username" onChange={this.handlechange}></input><br/>
                    {/* <span>Welcome {this.state.value}</span> */}

                    <input type="submit" value="Go"></input>
                    <h1>{this.state.msg}</h1>
                </form>
                
            </div>
        )
    }
}

export default Forms
