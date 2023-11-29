import { useSearchParams } from "react-router-dom";
import NavbarComponent from "./components/navbar";
import Products from "./components/products";
import Login from "../auth/login";
import HomeComponent from "./components/home";
import { useState } from "react";

function CustomerDashboard(){
    const [param] = useSearchParams();
    const [qStr,setQstr] = useState('')

    const searchProducts = (str)=>{
        console.log('seach func in parent comp called.....' + str)
        setQstr(str)
    }
    const process = ()=>{
        if(!param.get('page')){
            return  <div>
             <HomeComponent strVal={qStr}/>
        </div>
        }
        if(param.get('page') === 'products'){
             
            return <div>
                <Products />
            </div>
        }
        if(param.get('page') === 'cart'){
            return <div>
                <h1>Cart</h1>
            </div>
        }
        if(param.get('page') === 'previous_orders'){
             if(localStorage.getItem('isLoggedIn') === null){
                localStorage.setItem('url','/customer/dashboard?page=previous_orders')
                return <div>
                   <Login />
                </div>
             }
            return <div>
                <h1>Previous Orders</h1>
            </div>
        }

    }
    return(
        <div>
            <NavbarComponent func={searchProducts}/>
            {process()} 
        </div> 
        
    ) 
}

export default CustomerDashboard;