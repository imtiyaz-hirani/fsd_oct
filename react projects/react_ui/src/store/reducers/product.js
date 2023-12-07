const initialState={
    list: []
}
//this is a reducer
const product =(state=initialState,action)=>{
     
    if(action.type === 'GET_LIST'){
        return {...state,list: action.payload  }
    }

    if(action.type === 'UPDATE_PRODUCT'){
        //destructure the action to read id and status
        const {id,status} = action.payload;

        /* state==> product.list =[p1,p2,p3,p4,p5,p6] */ 
        //step 1: fetch the object that I wish to update 
        let productObj = state.list.find(p=>p.id === id) ; 
 
        //step 2: clone this object and update the status
        let cloneObj = Object.assign({},productObj);
        cloneObj.featured = status  

        //step 3: delete the object from the list before re-adding, so it prevent duplicate
        let tempList = state.list.filter(p=>p.id !== id) 
        
        //step 4: add the updated object to the tempList. 
        tempList.push(cloneObj)

        //step 5: return and attach tempList to state list. 
        return {...state,list: tempList } 
    }

    return state;
}
export default product;
/* 
action = {
                  type: 'GET_LIST',
                  payload: response.data
            }
action = {
        type: 'UPDATE_PRODUCT',
        payload: {
            'id': id,
            'status':status
        }
    }
*/


/* state==> product.list =[] */
/* state==> product.list =[p1,p2,p3,p4,p5,p6] */ 