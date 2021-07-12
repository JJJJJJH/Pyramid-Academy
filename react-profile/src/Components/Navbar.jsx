import React, {Component} from 'react'
import './styles/Main.css'

class Navbar extends Component{
    render(){
        return (
            <nav className="navbar">
                <a href="#home">Home</a>
                <a href="#container-about">About</a>
                <a href="#skillheader">Skills</a>
                <a id="profile-link" href="#profile">Projects</a>
                <a href="#contactnav">Contact</a>

            </nav>
        )
    }
}


export default Navbar