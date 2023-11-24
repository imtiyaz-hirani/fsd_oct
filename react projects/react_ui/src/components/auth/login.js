import { useState } from "react";
import { useNavigate } from "react-router";
import { Link } from "react-router-dom";

function Login(){
    const [username,setUsername] = useState('');
    const [password,setPassword] = useState('');
    const [msg,setMsg] = useState('');
    const navigate = useNavigate();
    
    const doLogin=()=>{
        if(username === 'harry@gmail.com' && password === 'potter@123'){
            localStorage.setItem('isLoggedIn',true);
            navigate(localStorage.getItem('url'))
        }
        else{
            setMsg('Invalid Credentials')
        }
    }
    return (
      <div className="container mt-4">
         
          <div className="row">
            <div className="col-md-3"></div>
            <div className="col-md-6">
              <div className="card">
                <div className="card-header">
                    <h3>Login</h3>
                </div>
                <div className="card-body">
                    {msg !== ''?
                          <div class="alert alert-danger" role="alert">
                            {msg}
                        </div>
                    :''}    
                  <div className="row " style={{textAlign: "right"}}>
                    <div className="col-md-6">
                      <label>Enter Email/Username:</label>
                    </div>
                    <div className="col-md-6 mb-4">
                      <input type="email" className="form-control" 
                      onChange={(e)=>setUsername(e.target.value)}/>
                    </div>
                  </div>
                  <div className="row" style={{textAlign: "right"}}>
                    <div className="col-md-6">
                      <label>Enter Password:</label>
                    </div>
                    <div className="col-md-6">
                      <input type="password" className="form-control" 
                      onChange={(e)=>setPassword(e.target.value)} />
                    </div>
                  </div>
                   
                </div>
                <div className="card-footer" style={{textAlign: "right"}}>
                    <button className="btn btn-primary" 
                    onClick={()=>doLogin()}>Login</button>
                  </div>
              </div>
              <div style={{textAlign: "left"}} className="mt-4">
                  <span>Don't have an Account 
                    <button className="button_link" 
                        onClick={()=>navigate('/auth/signup')}>Sign Up</button>
                    </span>
              </div>
            </div>
            <div className="col-md-3"></div>
          </div>
        
      </div>
    ); 
}

export default Login;