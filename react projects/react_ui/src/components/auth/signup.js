import { useState } from "react";
import { Container, Navbar } from "react-bootstrap";
import { useNavigate } from "react-router";

function Signup() {
    const [name,setName] = useState('');
    const [contact,setContact] = useState('');
    const [hno,setHno] = useState(''); 
    const [street,setStreet] = useState(''); 
    const [city,setCity] = useState(''); 
    const [pin,setPin] = useState(''); 
    const [state,setState] = useState('');    
    const [username,setUsername] = useState('');
    const [password,setPassword] = useState('');

    const [msg,setMsg] = useState('');
    const navigate = useNavigate();

    const doSignUp=()=>{

    }
  return (
    <div>
      <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand>MyApp</Navbar.Brand>
        </Container>
      </Navbar>

      <div className="container mt-4">
        <div className="row">
          <div className="col-md-3"></div>
          <div className="col-md-6">
            <div className="card">
              <div className="card-header">
                <h3>Sign Up</h3>
              </div>
              <div className="card-body">
                {msg !== "" ? (
                  <div class="alert alert-danger" role="alert">
                    {msg}
                  </div>
                ) : (
                  ""
                )}
                <div className="row " style={{ textAlign: "right" }}>
                    
                  {/* Read Name */}
                  <div className="col-md-6">
                    <label>Enter Name:</label>
                  </div>
                  <div className="col-md-6 mb-4">
                    <input
                      type="text"
                      className="form-control"
                      onChange={(e) => setName(e.target.value)}
                    />
                  </div>

                  {/* Read Contact */}
                  <div className="col-md-6">
                    <label>Enter Contact No:</label>
                  </div>
                  <div className="col-md-6 mb-4">
                    <input
                      type="number"
                      className="form-control"
                      onChange={(e) => setContact(e.target.value)}
                    />
                  </div>
                  
                  {/* Read Hno */}
                  <div className="col-md-6">
                    <label>Enter House No:</label>
                  </div>
                  <div className="col-md-6 mb-4">
                    <input
                      type="text"
                      className="form-control"
                      onChange={(e) => setHno(e.target.value)}
                    />
                  </div>

                    {/* Read street */}
                  <div className="col-md-6">
                    <label>Enter Street Name:</label>
                  </div>
                  <div className="col-md-6 mb-4">
                    <input
                      type="text"
                      className="form-control"
                      onChange={(e) => setStreet(e.target.value)}
                    />
                  </div>

                    {/* Read city */}
                  <div className="col-md-6">
                    <label>Enter City Name:</label>
                  </div>
                  <div className="col-md-6 mb-4">
                    <input
                      type="text"
                      className="form-control"
                      onChange={(e) => setCity(e.target.value)}
                    />
                  </div>

                    {/* Read pin */}
                  <div className="col-md-6">
                    <label>Enter Pin Code:</label>
                  </div>
                  <div className="col-md-6 mb-4">
                    <input
                      type="text"
                      className="form-control"
                      onChange={(e) => setPin(e.target.value)}
                    />
                  </div>
                  <hr />
                  <div className="col-md-6">
                    <label>Enter Email/Username:</label>
                  </div>
                  <div className="col-md-6 mb-4">
                    <input
                      type="email"
                      className="form-control"
                      onChange={(e) => setUsername(e.target.value)}
                    />
                  </div>
                </div>
                <div className="row" style={{ textAlign: "right" }}>
                  <div className="col-md-6">
                    <label>Enter Password:</label>
                  </div>
                  <div className="col-md-6">
                    <input
                      type="password"
                      className="form-control"
                      onChange={(e) => setPassword(e.target.value)}
                    />
                  </div>
                </div>
              </div>
              <div className="card-footer" style={{ textAlign: "right" }}>
                <button className="btn btn-primary" onClick={() => doSignUp()}>
                  SignUp
                </button>
              </div>
            </div>
            <div style={{ textAlign: "left" }} className="mt-4">
              <span>
                Have an Account?
                <button
                  className="button_link"
                  onClick={() => navigate("/auth/signup")}
                >
                  Login
                </button>
              </span>
            </div>
          </div>
          <div className="col-md-3"></div>
        </div>
      </div>
    </div>
  );
}

export default Signup;
