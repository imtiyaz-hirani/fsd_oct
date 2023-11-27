import { Component } from "react";

class ArrayDemoComponent extends Component{

    constructor(){
        super();
        this.state={
            arry:[4,3,7,1,9,2,0]
        }
    }
    
    sortArry =(direction)=>{
        let temp = [...this.state.arry];
        switch(direction){
            case 'ASC':
                temp.sort((a,b)=>a-b);
                this.setState({
                    arry: temp
                }) 
                break; 
            case 'DESC':
                temp.sort((a, b) => b - a);
                this.setState({
                  arry: temp,
                }); 
                break;
            default:
                break;
        }
        
        
    }
    render(){
        return(
            <div>
                <h3>Welcome to class component</h3>   
                <hr />
                {
                    this.state.arry.map((e,index)=>
                    <div key={index}>
                        {e}
                    </div>
                    )
                }
                <div>
                    <button onClick={()=>this.sortArry('ASC')}>ASC-Sort</button>
                    <button onClick={()=>this.sortArry('DESC')}>DESC-Sort</button>
                </div>
            </div>
        )
    }

    
}

export default ArrayDemoComponent;