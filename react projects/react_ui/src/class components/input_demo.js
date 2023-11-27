import { Component } from "react";

class InputDemoComponent extends Component {

    constructor(){
        super();

        this.state={
            name: '',
            city: '',
            age: ''
        }
    }

    process = (e)=>{
        e.preventDefault();
        console.log(this.state.name)
        console.log(this.state.city)
        console.log(this.state.age)
    }
    render(){
        return(
            <div>
                <h3>Please enter the details </h3>
                <form onSubmit={(e)=>this.process(e)} >
                    <label>Enter Name: </label>
                    <input type="text"  onChange={(e)=>this.setState(
                        {
                            name: e.target.value                         
                        }
                    )}/>
                    <br /><br />
                    <label>Enter Age: </label>
                    <input type="text"  onChange={(e)=>this.setState(
                        {
                            age: e.target.value
                          
                        }
                    )}/>
                    <br /><br />
                    <label>Enter city: </label>
                    <input type="text"  onChange={(e)=>this.setState(
                        {
                            city: e.target.value
                          
                        }
                    )}/>
                    <br /><br />
                    <input type="submit" value={'Submit Info'}/>
                </form>
            </div>
        )
    }
}

export default InputDemoComponent;