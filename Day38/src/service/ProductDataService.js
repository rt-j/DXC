import axios from 'axios'
const url="http://localhost:8001/product"
//const url1="http://10.231.138.235:8001/product"
// const url2="http://localhost:8001/product/2"
class ProductDataService{
    getAllProducts(){
        return axios.get(`${url}`)
    }
    deleteProduct(productId){
            return axios.delete(`${url}/${productId}`)
    }
    getProduct(productId){
        return axios.get(`${url}/${productId}`)
}

}export default new ProductDataService()