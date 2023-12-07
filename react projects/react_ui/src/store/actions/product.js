import axios from "axios"

export const getProducts = () =>(dispatch)=>{
    console.log('in getProducts of Action.....')

    axios.get('http://localhost:8082/product/all')
    .then(response => {
        //give the response to the reducer 
        dispatch({
            type: 'GET_LIST',
            payload: response.data
        })
    })
}

export const updateProductFeature= (id,status)=>(dispatch)=>{
     axios.put('http://localhost:8082/product/update',{
        'id': id,
        'status':status
    } ) 

    dispatch({
        type: 'UPDATE_PRODUCT',
        payload: {
            'id': id,
            'status':status
        }
    })
}