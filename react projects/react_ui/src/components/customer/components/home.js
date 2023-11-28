import axios from "axios";
import { useEffect, useState } from "react";
import { Button, Card, CardBody,  CardSubtitle, CardText, CardTitle, Nav  } from "react-bootstrap";
 import SidebarComponent from "./sidebar";

function HomeComponent(){
     const [featuredProducts,setFeaturedProducts] = useState([]);
    const [msg,setMsg] = useState('');
     
    useEffect(()=>{
       
        axios.get('http://localhost:8082/product/featured')
        .then(response=> setFeaturedProducts(response.data))
        .catch(error=> setMsg('Error in Fetching Products'));
    },[])
    
    return (
      <div className="container-fluid">
        <div className="row">
          <div className="col-md-3">
            <SidebarComponent />
            
          </div>
          <div className="col-md-9">
            <div className="row">
              {featuredProducts.map((p, index) => (
                <div key={index} className="col-md-4 mb-4">
                  <Card
                    style={{
                      width: "18rem",
                      height: "12rem",
                    }}
                  >
                    {/* <img alt="Sample" src="https://picsum.photos/300/200" /> */}
                    <CardBody>
                      <CardTitle tag="h5">{p.title}</CardTitle>
                      <CardSubtitle className="mb-2 text-muted" tag="h6">
                        Price: INR. {p.price}
                      </CardSubtitle>
                      <CardText>{p.description}</CardText>
                      <Button>Button</Button>
                    </CardBody>
                  </Card>
                  <Nav.Link> </Nav.Link>
                </div>
              ))}
            </div>
          </div>
        </div>
      </div>
    );
}
export default HomeComponent;