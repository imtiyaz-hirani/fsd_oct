import { useEffect, useState } from "react";

function ViewUsers(){

    const [users,setUsers] = useState([]);

    useEffect(()=>{
        fetch('https://jsonplaceholder.typicode.com/users')
        .then(resp=>resp.json())
        .then(data=>setUsers(data))
    })
    return(
        <div>
            {
                users.map((u,index)=>
                <div key={index}>
                    Name: {u.name} <br />
                    Email: {u.email} <br />
                    City: {u.address.city} <br />
                    Location: {u.address.geo.lat} <br /> 
                    Contact: {u.phone} <br />
                    Company: {u.company.name}
                    <hr/>
                </div>
                )
            }
        </div>
    )
}

export default ViewUsers;