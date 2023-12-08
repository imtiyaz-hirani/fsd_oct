import axios from 'axios';
import { Splitter, SplitterPanel } from 'primereact/splitter';
import { useEffect, useState } from 'react';
import { Nav } from 'react-bootstrap';


function PrimeComponent(){
    const [products,setProducts] = useState([]); 
    const [description,setDescription] = useState(''); 
    const [product,setProduct] = useState({}); 
    const [showSplitter,setShowSplitter] = useState(false)
    useEffect(()=>{
        const getAllProducts = async ()=>{
            const response = await axios.get('http://localhost:8082/product/all')
            setProducts(response.data)
          }
          getAllProducts();
    },[])

    const viewMore = (pid)=>{
        const productObj = products.find(p=>p.id === pid);
        setProduct(productObj);
        setShowSplitter(true)
    }
    return (
      <div>
        <Splitter style={{ height: "300px" }}>
          <SplitterPanel className="flex align-items-center justify-content-center">
            {products.map((p, index) => (
              <div>
                <p key={index}>
                  {p.title} --- {p.price} --- {p.description}
                  <Nav.Link onClick={() => viewMore(p.id)}>View More</Nav.Link>
                </p>
              </div>
            ))}
          </SplitterPanel>
           
            <SplitterPanel className="flex align-items-center justify-content-center">
             {
             !showSplitter?'':   
             <div> 
              <h3>{product.title}</h3>
              Vendor Name: {product?.vendor?.name} <br />
              Category Name: {product?.category?.name}
              </div>
            } 
            </SplitterPanel>
         
        </Splitter>
      </div>
    );
}
 
export default PrimeComponent;