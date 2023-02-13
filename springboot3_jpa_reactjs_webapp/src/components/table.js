import axios from "axios";
import {useEffect, useState} from "react";

const Table = () =>{
    const[data,setData] = useState([]);

    useEffect(() => {
        const fetchData = async () => {

            const result = await axios.get('http://localhost:8080/users');
            setData(result.data);
        };
        fetchData();
    }, []);

    return (
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Email</th>
            </tr>
            </thead>
            <tbody>
            {data.map(item => (
                <tr key={item.id}>
                    <td>{item.id}</td>
                    <td>{item.name}</td>
                    <td>{item.age}</td>
                    <td>{item.email}</td>
                </tr>
            ))}
            </tbody>
        </table>
    );
}

export default Table;