import axios from "axios"
import { Component } from "react"
import withRouter from "./with_router";
 
class CommentComponent extends Component{
    
    constructor(props){
        super(props)

        this.state={
            postId: this.props.params.id ,
            comments: []
        }
    }

    componentDidMount(){
        
        axios.get('https://jsonplaceholder.typicode.com/comments?postId=' + this.state.postId)
        .then(response=>this.setState({
            comments: response.data
        }))
    }
    render(){
       
         return(
            <div>
                <h2>Comments of the post:  </h2>
                <hr/>
                {
                    this.state.comments.map((c,index)=>
                    <div key={index}>
                        {c.body} <br />
                        By: {c.email}
                        <br /><br />
                    </div>
                    )
                }
            </div>
        )
    }

}
 

	
export default withRouter(CommentComponent);