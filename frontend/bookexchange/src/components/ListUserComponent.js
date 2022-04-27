import React, {useState,useEffect} from 'react'
// import { Link } from 'react-router-dom'
import UserService from '../services/UserService'

const ListUserComponent = () => {

    const [Users, setUsers] = useState([])

    useEffect(() => {

        getAllUsers();
    }, [])

    const getAllUsers = () => {
        UserService.getAllUsers().then((response) => {
            setUsers(response.data)
            console.log(response.data);
        }).catch(error =>{
            console.log(error);
        })
    }

    // const deleteUser = (UserId) => {
    //    UserService.deleteUser(UserId).then((response) =>{
    //     getAllUsers();

    //    }).catch(error =>{
    //        console.log(error);
    //    })
        
    // }

    return (
        <div className = "container">
            <h2 className = "text-center"> List Users </h2>
            {/* <Link to = "/add-user" className = "btn btn-primary mb-2" > Add User </Link> */}
            <table className="table table-bordered table-striped">
                <thead>
                    <th> User Id </th>
                    <th> User Name </th>
                    <th> User Email </th>
                    <th> User Phone</th>
                    <th> User Address </th>
                </thead>
                <tbody>
                    {
                        Users.map(
                            User =>
                            <tr key = {User.userId}> 
                                <td> {User.userId} </td>
                                <td> {User.username} </td>
                                <td>{User.email}</td>
                                <td>{User.phone}</td>
                                <td>{User.address}</td>
                                {/* <td>
                                    <Link className="btn btn-info" to={`/edit-User/${User.id}`} >Update</Link>
                                    <button className = "btn btn-danger" onClick = {() => deleteUser(User.id)}
                                    style = {{marginLeft:"10px"}}> Delete</button>
                                </td> */}
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListUserComponent
