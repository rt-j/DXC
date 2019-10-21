import React, { Component } from 'react'
import './LoginValidation.css'
class LoginValidation extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 fullName:'',
                 password:'',
                 errors:{
                     fullName:'',
                     password:''
                 }
    }
}
doValidation=(e)=>{
    e.preventDefault()
    const {name,value}=e.target;
    let errors=this.state.errors
    switch(name){
        case 'fullName':
            errors.fullName=value.length<3?'Must be 3':''
            break;
            case 'password':
                    errors.password=value.length<3?'Must be 3':''
                break;

            default:
                break;
    }
    this.setState({
        errors,[name]:value//errors and name will contain value
    })
}

    render() {
        return (
            <div>
                <div className='wrapper'>
                <div className='form-wrapper'>
                    <h2>Enter Details</h2>
                    <form onSubmit={this.doValidation}>
                    <div className='fullName'>
                        <label htmlFor="fullName">Full Name</label>
                        <input type="text" name="fullName" onChange={this.doValidation} />
                    <span class="error">{this.state.errors.fullName}</span> 
                    </div>
                    <div className='fullName'>
                        <label htmlFor="fullName">PassWOrd</label>
                        <input type="password" name="password" onChange={this.doValidation} />
                    <span class="error">{this.state.errors.password}</span> 
                    </div>
                    <div className='submit'>
                        <input type="submit" />
                    </div>
                    </form>
                </div>
            </div>
            </div>
        )
    }
}

export default LoginValidation
