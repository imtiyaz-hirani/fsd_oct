import axios from "axios";
import { useEffect, useState } from "react";
import { Card, CardHeader, ListGroup, ListGroupItem, Nav } from "react-bootstrap";
import { useNavigate } from "react-router";

function SidebarComponent(){
    const navigate = useNavigate();
    const [categories,setCategories] = useState([]);
    const [msg,setMsg] = useState('');
    
    useEffect(()=>{
        axios.get('http://localhost:8082/category/all')
        .then(response=> setCategories(response.data))
        .catch(error=> setMsg('Error in Fetching categories')); 
    },[])
    return(
        <div>
             <Card
              style={{
                width: "18rem",
              }}
            >
              <CardHeader>Categories</CardHeader>
              <ListGroup >
              {categories.map((c, index) => (
              <div key={index} >
                 <ListGroupItem> 
                         <Nav.Link onClick={()=>navigate('/customer/dashboard?page=products&cid='+c.id)}> {c.name}</Nav.Link>
                </ListGroupItem>
              </div>
            ))}
              </ListGroup>
            </Card>
        </div>
    )
}

export default SidebarComponent;