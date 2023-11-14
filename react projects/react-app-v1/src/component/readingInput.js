import { useState } from "react";

function ReadingInput(){
    let [name,setName] = useState('');

    const process=()=>{
        console.log(name);
    }

    const changeHandler =(event)=>{
        console.log(event);
    }
    return(
        <div>
            <h3>Reading input from User: </h3>

            <div>
                <label>Please enter your name: </label>
                <input type="text" value={name} onChange={(e)=>changeHandler(e.target.value) }/>
                <br />
                <button onClick={()=>process()}>Submit</button>
            </div>
        </div>
    )
}

export default ReadingInput;