import axios from "axios"
import { Component } from "react"
import { Link } from "react-router-dom"

class PostComponent extends Component{

    constructor(){
        super()

        this.state={
            posts: []
        }
    }

    componentDidMount(){
        axios.get('https://jsonplaceholder.typicode.com/posts')
        .then(response=>this.setState({
            posts: response.data
        }))
    }

    render(){
        return(
            <div>
                <h2>All Posts from JsonPlaceHolder API platform</h2>
                <hr />
                {
                    this.state.posts.map((p,index)=>
                    <div key={index} className="container" style={{textAlign:"left"}}>
                        <h4>{index+1}. {p.title}</h4>
                        <p>{p.body}</p>
                        <Link to={'/posts/comments/' + p.id}>
                            <button >View Comments</button>
                        </Link> 
                        <hr />
                    </div>
                    
                    )
                }
            </div>
        )
    }
}

export default PostComponent