 import { Route, Routes } from "react-router";
import "./App.css";
import CustomerDashboard from "./components/customer/dashboard";
import VendorDashboard from "./components/vendor/dashboard";
import ExecutiveDashboard from "./components/executive/dashboard";
import Login from "./components/auth/login";
import Signup from "./components/auth/signup";
import Logout from "./components/auth/logout";
 import CommentComponent from "./class components/comments";
import ReduxProduct from "./components/redux/products";
 
function App() {
   
  return (
    <div className="App">
        <Routes>
          <Route path="/" element={<ReduxProduct />}></Route>
          <Route path="/posts/comments/:id" element={<CommentComponent />}></Route>
          <Route path="/customer/dashboard" element={<CustomerDashboard />}></Route>
          <Route path="/vendor/dashboard" element={<VendorDashboard />}></Route>
          <Route path="/executive/dashboard" element={<ExecutiveDashboard />}></Route>
          <Route path="/auth/login" element={<Login />}></Route>
          <Route path="/auth/signup" element={<Signup />}></Route>
          <Route path="/auth/logout" element={<Logout />}></Route>
         </Routes>
    </div>
  );    
}
 
export default App;  
 