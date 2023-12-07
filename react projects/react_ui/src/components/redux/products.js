import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { getProducts, updateProductFeature } from "../../store/actions/product";

function ReduxProduct(){
     const dispatch = useDispatch();
     let {list} = useSelector((state)=>state.product)
     //list = list.sort((a,b)=>a.price - b.price)  
     useEffect(()=>{
         dispatch(getProducts())    
          
     },[dispatch])

    const update = (id,val)=>{
        dispatch(updateProductFeature(id,!val))   
    }
    return (<div>
        <h1>All products from Redux Store</h1>
        
        {
            
            list.map((p,index)=>(
                <div key={index}>
                {p.title}  <br />
                Price: {p.price} <br />
                {p.description} <br />
                Sold By: {p.vendor.name} <br />
                <span> 
                    Featured: {p.featured?'YES':'NO'} &nbsp;&nbsp;&nbsp;
                    <button className="btn btn-secondary" onClick={()=>update(p.id,p.featured)}>Update Feature</button>
                </span>

                <br /><br />
            </div>
            ))
        }
    </div>)
}
export default ReduxProduct;