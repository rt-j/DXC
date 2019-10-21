import React, { Component } from 'react'

class Assignmentchild extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div>
               <li><ol>{this.props.alist}</ol></li> 
            </div>
        )
    }
}

export default Assignmentchild

