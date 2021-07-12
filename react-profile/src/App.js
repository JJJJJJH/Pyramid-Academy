import React from 'react';
import './App.css';
import Header from './Components/header'
import About from './Components/About'
import Banner from './Components/Banner'
import Navbar from './Components/Navbar'
import Profile from './Components/Profile'
import Project from './Components/Project'

function App() {
  return (
    <div className="App">
      <Header />
      <hr />
      <About />
      <hr />
      <Banner />
      <br />
      <Navbar />
      <br />
      <br />
      <Profile />
      <Project />
    </div>
  );
}

export default App;
