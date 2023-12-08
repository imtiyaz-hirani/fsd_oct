import axios from "axios";
import { useEffect, useState } from "react";
import { api } from "../../../environment_dev";

function AddProduct(){

    const [products,setProducts] = useState([]);
    const [pname,setPname] = useState('');
    const [msg,setMsg] = useState();
    const [image,setImage] = useState('')
    useEffect(()=>{
        
        const getProducts =async () =>{
            const response = await axios.get(api.serverUrl + '/product/all');
            setProducts(response.data)
        }
        
        getProducts();
         
    },[])

    const upload = ()=>{
        const product =  products.find(p=>p.title === pname);
        if(product === undefined){
            setMsg('Please select proper product from the list..')
        }
        else{ 
            console.log(product)
            console.log(image)
            let str = image.split('\\fakepath\\')[0];
            //call the api 
        }
    }
    return (
      <div>
         {msg?msg: ''} <br />
          <label >Select Product Name: </label>
          <input list="products" onKeyUp={(e)=>{setMsg(''); setPname(e.target.value)}}/>
          <datalist id="products">
          {products.map((p, index) =>
            pname.length  < 2?'':
            <option key={index} value={p.title}></option>
            )}
          </datalist>
            <br />
            <label>Add an Image: </label>
            <input type="file" 
            onClick={(e)=>e.target.files.length ===0?'':setImage(e.target.files[0].name)} />
            <br /> <br />
            <button onClick={()=>upload()}>Submit</button>
      </div>
    );
}

export default AddProduct;