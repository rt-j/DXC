import React, { Component } from 'react'
import ListProductComponent from './component/ListProductComponent'
import './App.css'
import {Switch,Route} from 'react-router-dom';
import {BrowserRouter as Router} from 'react-router-dom';
import ProductComponent from './component/ProductComponent';
class App extends Component {
  constructor(props) {
    super(props)

    this.state = {
         
    }
  }

  render() {
    return (
      <div>
        <Router>
        <Switch>
       <Route exact path="/" component={ListProductComponent}></Route>
       <Route exact path="/product/:pId" component={ProductComponent}/>
       </Switch>
       </Router>
      </div>
    )
  }
}

export default App
