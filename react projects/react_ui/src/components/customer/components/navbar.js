import { Button, Col, Container, Form, Nav, Navbar, Row } from "react-bootstrap";
import { useNavigate } from "react-router";
 

function NavbarComponent(){

    const navigate = useNavigate();
    return(
        <div className="mb-4">
            <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home">MyApp</Navbar.Brand>
          <Navbar.Brand onClick={()=>navigate('/customer/dashboard')}>Customer Dashboard</Navbar.Brand>
          <Nav className="me-auto mr-4">
            <Nav.Link onClick={()=>navigate('/customer/dashboard?page=cart')}>Cart</Nav.Link>
            <Nav.Link onClick={()=>navigate('/customer/dashboard?page=previous_orders')}>Previous Orders</Nav.Link>
          </Nav>
          <Navbar.Collapse className="justify-content-end">
          <Form inline >
        <Row >
          <Col xs="auto">
            <Form.Control
              type="text"
              placeholder="Search"
              className=" mr-sm-2"
            />
          </Col>
        </Row>
      </Form>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          {
            localStorage.getItem('isLoggedIn')?<Navbar.Text>
            Signed in as: <a href="#login">Mark Otto</a>
          </Navbar.Text>: 
          <button className="btn btn-primary">Login</button>
          }
          

        </Navbar.Collapse>
        </Container>
      </Navbar>
      
        </div>
    )
}

export default NavbarComponent;