import { useEffect, useState } from "react";

function ViewPosts(){
    const [posts,setPosts] = useState([]); //hook 

    useEffect(()=>{   //hook 
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(response=>response.json())
        .then(data=> setPosts(data.slice(0,5)));
      },[])

    return(
        <div>
            {
              posts.map((p,index)=>
                <div key={index} >
                    <span style={{fontFamily:"cursive"}}>{p.title} </span><br />
                    {p.body}
                </div>
                )
            }
      </div>
    )
}

export default ViewPosts;