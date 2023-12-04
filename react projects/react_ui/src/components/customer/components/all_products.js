import axios from "axios";
import { useEffect, useState } from "react";
import {  Nav } from "react-bootstrap";

function AllProducts(){

    const [page,setPage] = useState(0);
    const [size,] = useState(3);
    const [products,setProducts] = useState([]);

    useEffect(()=>{
        axios.get('http://localhost:8082/product/all?page=' + page+ '&size=' + size)
        .then(response=>setProducts(response.data))
    },[page,size]);

    const getProducts = (direction)=>{
        let temp = page; 
        if(direction === 'prev'){
            setPage(--temp);
        }
        else{
            setPage(++temp);
        }
     }
    return (
      <div>
        <h1>All Products</h1>
        {products.length === 0? <div>No more products to show...</div>:''}
        {products.map((p, index) => (
          <div>
            <p key={index}>
              {p.title} --- {p.price} --- {p.description}
            </p>
          </div>
        ))}

        <nav aria-label="Page navigation example">
          <ul className="pagination justify-content-center">
            <li className="page-item ">
                {page === 0? 
              <Nav.Link className="page-link disabled" onClick={()=>getProducts('prev')}>
                Previous
               </Nav.Link> :
               <Nav.Link className="page-link" onClick={()=>getProducts('prev')}>
                Previous
               </Nav.Link>
                }
            </li>
            <li className="page-item">
                
                {products.length === 0? 
                
              <Nav.Link className="page-link disabled"  onClick={()=>getProducts('next')} >
                Next
              </Nav.Link> 
              :
              <Nav.Link className="page-link" onClick={()=>getProducts('next')}>
                Next
              </Nav.Link>
              }
            </li>
          </ul>
        </nav>
      </div>
    );

}
export default AllProducts;