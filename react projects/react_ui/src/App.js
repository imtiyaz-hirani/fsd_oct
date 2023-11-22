import { useState } from "react";
import "./App.css";
 
function App() {
   const [name,setName] = useState('');
   const [username,setUsername] = useState('');
   const [password,setPassword] = useState('');
   const [nameMsg,setNameMsg] = useState('');
   const [usernameMsg,setUsernameMsg] = useState('');
   const [passwordMsg,setPasswordMsg] = useState('');

   const validate = () =>{
    let isValid = true; 

     if(name === ''){
        isValid = false
        setNameMsg('Name is required')
     }

     if(username === ''){
      isValid = false
      setUsernameMsg('username is required')
   }

   if(password === ''){
    isValid = false
    setPasswordMsg('password is required')
 }

     return isValid; 
   }
  return (
    <div className="App">
      <h3>Hello React!!!</h3>
      <hr />
          <label>Enter name: </label>
          <input type="text" onKeyUp={(e)=>setName(e.target.value) }></input>
          <br />
          <span className="error_msg">{name === ''?nameMsg : ''}</span>
          <br />
          <label>Enter Username: </label>
          <input type="text" onKeyUp={(e)=>setUsername(e.target.value)} ></input>
          <br />
          <span  className="error_msg">{username === ''?usernameMsg : ''}</span>
          <br />
          <label>Enter PAssword: </label>
          <input type="text" onKeyUp={(e)=>setPassword(e.target.value)}></input>
          <br />
          <span  className="error_msg">{password === ''?passwordMsg : ''}</span>
          <br />
          <button onClick={()=>validate()}>Sign Up</button>
          <br /><br />
          <div>
             {name} <br />
             {username}<br />
             {password}
          </div>
    </div>

  )    
}
 
export default App;

/** 
 *  (e,)=><div>{e}</div>
 * Each child in a list should have a unique "key" prop
 * 
 * calling a function: increment() -- wrong 
 *   calling a function: ()=>increment() -- right 
 * **/