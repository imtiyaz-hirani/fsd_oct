import axios from "axios";
import React, { useState } from "react";
import { Button, Col, Container, Form, Nav, Navbar, Row } from "react-bootstrap";
import { useNavigate } from "react-router";

function NavbarComponent({func}){ //{1,2,3,4}

  const [qStr,setQStr] = useState('');

    const navigate = useNavigate();
    return(
        <div className="mb-4" >
            <Navbar bg="dark" data-bs-theme="dark" style={{marginLeft: '4px', marginRight:'5px'}}>
        
          <Navbar.Brand href="#home">MyApp</Navbar.Brand>
          <Navbar.Brand onClick={()=>navigate('/customer/dashboard')}>Customer Dashboard </Navbar.Brand>
          <Nav className="me-auto mr-4">
            <Nav.Link onClick={()=>navigate('/customer/dashboard?page=cart')}>Cart</Nav.Link>
            <Nav.Link onClick={()=>navigate('/customer/dashboard?page=previous_orders')}>Previous Orders</Nav.Link>
          </Nav>
          <Navbar.Collapse className="justify-content-end">
          <Form onSubmit={(e)=>{ 
            e.preventDefault();  
            func(qStr); 
             }} >
        <Row >
          <Col xs="auto">
            <Form.Control
              type="text"
              placeholder="Search"
              className=" mr-sm-2"
              onChange={(e)=>setQStr(e.target.value)}
            />
          </Col>
        </Row>
      </Form>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          {
            localStorage.getItem('isLoggedIn')?
            <React.Fragment>
            <Navbar.Text >
            Signed in as: <span style={{color: "white"}}> 
            {localStorage.getItem('username')} 
            </span>
          </Navbar.Text>
          &nbsp;&nbsp;&nbsp;
          <button className="btn btn-info btn-sm ml-4" onClick={()=>{
            localStorage.clear();
            navigate('/auth/login?msg=you have logged out..')
          }}>Logout</button>
          </React.Fragment>
          : 
          <button className="btn btn-primary" onClick={()=>navigate('/auth/login')}>Login</button>
          }
          

        </Navbar.Collapse>
         
      </Navbar>
      
        </div>
    )
}

export default NavbarComponent;