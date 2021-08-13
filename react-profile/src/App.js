import React, { Component } from 'react';
import Highcharts from 'highcharts';
import HighchartsReact from 'highcharts-react-official';
import GenSpark from './images/logo.png';
import GenSparkPic from './images/genspark.png';
import jh from './images/jh.png';
import PurpleCircle from './images/purpleCircle.png';
import OrangeCircle from './images/orangeCircle.png';
import Ttu from './images/TTU.jpg';
import ReactToPrint from "react-to-print";
import Printer from './images/printer.png';
import Word from './images/word.png';
import file from './images/profile.docx';
import './App.css';

class App extends Component {
  render() {
    const frontEndOptions = {
      chart: {
        height: 350,
        width: 350,
        type: 'pie'
      },
      credits: {
        enabled: false
      },
      legend: {
        align: 'bottom',
        layout: 'vertical',
        x: 85
      },
      title: {
        text: 'Front-End Tech'
      },
      plotOptions: {
        pie: {
          shadow: false
        }
      },
      tooltip: {
        formatter: function () {
          return '<b>' + this.point.name + '</b>: ' + this.y;
        }
      },
      series: [
        {
          name: 'Technologies',
          data: [["HTML/CSS (6 Months)", 6], ["React (3 Months)", 3], ["JavaScript (4 Months)", 4], ["Bootstrap (4 Months)", 4]],
          size: '45%',
          innerSize: '50%',
          showInLegend: true,
          dataLabels: { enabled: false }
        }
      ]
    };
    const backEndOptions = {
      chart: {
        height: 350,
        width: 350,
        type: 'pie'
      },
      credits: {
        enabled: false
      },
      legend: {
        align: 'bottom',
        layout: 'vertical',
        x: 85
      },
      title: {
        text: 'Back-End Tech'
      },
      plotOptions: {
        pie: {
          shadow: false
        }
      },
      tooltip: {
        formatter: function () {
          return '<b>' + this.point.name + '</b>: ' + this.y;
        }
      },
      series: [
        {
          name: 'Technologies',
          data: [["Java (6 Months)", 6], ["Spring/SpringBoot (3 Months)", 3], ["Python (24 Months)", 24], ["C# (1 Months)", 1]],
          size: '45%',
          innerSize: '50%',
          showInLegend: true,
          dataLabels: { enabled: false }
        }
      ]
    };
    const devOpsOptions = {
      chart: {
        height: 350,
        width: 350,
        type: 'pie'
      },
      credits: {
        enabled: false
      },
      legend: {
        align: 'bottom',
        layout: 'vertical',
        x: 85
      },
      title: {
        text: 'DevOps'
      },
      plotOptions: {
        pie: {
          shadow: false
        }
      },
      tooltip: {
        formatter: function () {
          return '<b>' + this.point.name + '</b>: ' + this.y;
        }
      },
      series: [
        {
          name: 'Technologies',
          data: [["GitKraken (4 Months)", 4], ["GitHub (4 Months)", 4]],
          size: '45%',
          innerSize: '50%',
          showInLegend: true,
          dataLabels: { enabled: false }
        }
      ]
    };
    const databaseLayerOptions = {
      chart: {
        height: 350,
        width: 350,
        type: 'pie'
      },
      credits: {
        enabled: false
      },
      legend: {
        align: 'bottom',
        layout: 'vertical',
        x: 100
      },
      title: {
        text: 'Database'
      },
      plotOptions: {
        pie: {
          shadow: false
        }
      },
      tooltip: {
        formatter: function () {
          return '<b>' + this.point.name + '</b>: ' + this.y;
        }
      },
      series: [
        {
          name: 'Technologies',
          data: [["SQL (10 Months)", 10], ["MySQL (6 Months)", 6], ["MongoDB (1 Months)", 1]],
          size: '45%',
          innerSize: '50%',
          showInLegend: true,
          dataLabels: { enabled: false }
        }
      ]
    };
    const devToolsOptions = {
      chart: {
        height: 350,
        width: 350,
        type: 'pie'
      },
      credits: {
        enabled: false
      },
      legend: {
        align: 'bottom',
        layout: 'vertical',
        x: 85
      },
      title: {
        text: 'Developer Tools'
      },
      plotOptions: {
        pie: {
          shadow: false
        }
      },
      tooltip: {
        formatter: function () {
          return '<b>' + this.point.name + '</b>: ' + this.y;
        }
      },
      series: [
        {
          name: 'Technologies',
          data: [["IntelliJ (4 Months)", 4], ["Jupyter Notebook (12 Months)", 12], ["Visual Studio Code (18 Months)", 18], ["Visual Studio (3 Months)", 3]],
          size: '45%',
          innerSize: '50%',
          showInLegend: true,
          dataLabels: { enabled: false }
        }
      ]
    };
    return (
      <div className="App" ref={(el) => (this.componentRef = el)}>
        <div className="container">
          <header className="App-header">
            <ReactToPrint
              trigger={() => <button style={{ backgroundColor: "transparent", borderColor: "transparent", cursor: "pointer", marginRight: 45 }}><img src={Printer} alt="alt" className="Printer" /><div style={{ fontSize: 16, color: "#1DBEFF" }}>Print</div></button>}
              content={() => this.componentRef}
            />
            <a style={{ textDecoration: "none" }} download='profile.docx' href={file}><img src={Word} alt="alt" className="Word" /><div style={{ fontSize: 16, color: "#1DBEFF", justifyContent: "end", alignSelf: "flex-end", width: 70, height: "fit-content", marginLeft: 90 }}>Export Word</div></a>
          </header>
          <div className="topRow">
            <div className="imageContainer">
              <img src={jh} alt="alt" className="profilepic" />
            </div>
            <div className="nameAndTitle">
              <div className="name">
                Jessica Hao
      </div>
              <div className="jobTitle">
                Fullstack Java Developer
      </div>
            </div>
            <img src={GenSpark} alt="alt" className="gensparkPic" />
          </div>
          <div className="equivPanel">
            <div className="equivHeader" >
              <img src={GenSparkPic} alt="alt" className="keyboardPic" />
          Industry Equivalency
        </div>
            <div className="equivBody">


              <div className="circleContainer">
                <div className="circle">
                  <img src={PurpleCircle} alt="alt" className="circleImage" />
                  <div className="numberEquiv">1</div>
                </div>
                <p className="typeOfEquiv">C#</p>
              </div>


              <div className="circleContainer">
                <div className="circle">
                  <img src={OrangeCircle} alt="alt" className="circleImage" />
                  <div className="numberEquiv">24</div>
                </div>
                <p className="typeOfEquiv">Python</p>
              </div>


              <div className="circleContainer">
                <div className="circle">
                  <img src={PurpleCircle} alt="alt" className="circleImage" />
                  <div className="numberEquiv">6</div>
                </div>
                <p className="typeOfEquiv">Java</p>
              </div>


              <div className="circleContainer">
                <div className="circle">
                  <img src={OrangeCircle} alt="alt" className="circleImage" />
                  <div className="numberEquiv">4</div>
                </div>
                <p className="typeOfEquiv">JavaScript</p>
              </div>


              <div className="circleContainer">
                <div className="circle">
                  <img src={PurpleCircle} alt="alt" className="circleImage" />
                  <div className="numberEquiv">6</div>
                </div>
                <p className="typeOfEquiv">HTML/CSS</p>
              </div>


              <div className="circleContainer">
                <div className="circle">
                  <img src={OrangeCircle} alt="alt" className="circleImage" />
                  <div className="numberEquiv">3</div>
                </div>
                <p className="typeOfEquiv">React</p>
              </div>

              <p className="equivDescription">
                Equivalency in Months
          </p>
            </div>
          </div>
          <div className="aboutMe">
            <h2>
              About Me
        </h2>
            <p className="aboutMeParagraph">
              I recently graduated from Texas Tech University with a bachelor in Integrative Studies, Computer Science, and Mathematics. After graduating, I joined in GenSpark's training program to help prepare me for my career, and now I am looking for a company at which I can continue to learn and grow as a software engineer.<br /><br />
        Dedicated and efficient full stack developer in application layers, presentation layers, and database. Certified in Backend technology. Team worker across technology, design, and planning. Seeking for further improve Java skill as the future full stack developer.</p>
          </div>
          <div className="equivPanel2">
            <div className="equivHeader2" >
              <img src={GenSparkPic} alt="alt" className="keyboardPic" />
          Education and Certification
      </div>
            <div className="equivBody2">
              <div className="WichitaState">
                <div className="WichitaStateImage">
                  <img src={Ttu} alt="alt" className="Ttu" />
                </div>
                <p className="bach">
                  Bachelor's Degree - Integrative Studies, Computer Science, and Mathematics
        </p>
                <p className="bachinfo">
                  Texas Tech University - May 2019
        </p>
              </div>
            </div>
          </div>
          <div className="equivPanel3">
            <div className="equivHeader3" >
              <img src={GenSparkPic} alt="alt" className="keyboardPic" />
          Skill Matrix
      </div>
            <div className="equivBody3">
              <div style={{ width: 350, height: 350 }}>
                <HighchartsReact highcharts={Highcharts} options={frontEndOptions} />
              </div>

              <div style={{ width: 350, height: 350 }}>
                <HighchartsReact highcharts={Highcharts} options={backEndOptions} />
              </div>

              <div style={{ width: 350, height: 350 }}>
                <HighchartsReact highcharts={Highcharts} options={devOpsOptions} />
              </div>

              <div style={{ width: 350, height: 350 }}>
                <HighchartsReact highcharts={Highcharts} options={databaseLayerOptions} />
              </div>

              <div style={{ width: 350, height: 350 }}>
                <HighchartsReact highcharts={Highcharts} options={devToolsOptions} />
              </div>

            </div>
          </div>
          <div className="equivPanel4">
            <div className="equivHeader4" >
              <img src={GenSparkPic} alt="alt" className="keyboardPic" />
          Projects
      </div>
            <div className="equivBody4">
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Locus
        </h4>
              <p>
                Worked on a team for my Capstone Project as a developer to build an app avoid children run far away from their parents.
                This application create groups for leader(parent) and users(children). It tracks the locations of each user once per 10 seconds.
                If the location is over 10 meters(available to change) far from the leader,the leader's phone will receive the warning message.

        </p>
              <h5 style={{ marginBottom: 10, fontSize: 24, letterSpacing: 1, fontWeight: 400, marginTop: 9 }}>
                Roles / Responsibilities
        </h5>
              <p>• Designed and implemented a program to track the location of each members in the group.

<br />• Follow by the project's plan and delivery on time for each spring meeting.
<br />• Actively discuss and work with the team to improve program performance。
</p>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Environment / Technologies
                </h4>
              <p>
                Android Studio with Java language, BlueTooth, Google Map API, Firebase
          </p>
              <hr></hr>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Snake Game
      </h4>
              <p>Worked with two teammates in GenSpark. This project is a update of classic Snake game.
              It mainly used Java GUI skills(JFrame, JPanel).
              We build three type of fruits to control and change the snake's moving speed.

      </p>
              <h5 style={{ marginBottom: 10, fontSize: 24, letterSpacing: 1, fontWeight: 400, marginTop: 9 }}>
                Roles / Responsibilities
      </h5>
              <p>• design and planning the snake project.
      <br />  • build board class and snake class.
      </p>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Environment / Technologies
            </h4>
              <p>
                Java, JFrame, JPanel
</p>
            </div>
          </div>

          <div className="equivPanel6">
            <div className="equivHeader6" >
              <img src={GenSparkPic} alt="alt" className="keyboardPic" />
          GitHub Projects
      </div>
            <div className="equivBody6">
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                <a href="https://github.com/JJJJJJH/Pyramid-Academy">Pyramid Academy Personal Projects</a>
              </h4>
              <p>
                This is a package of projects I have done in GenSpark.
                Projects: Battleship, GuessTheNumber, Hangman, Human VS Goblins, Noughts and Crosses(TicTacToe), RPS(Rock Paper Scissors), Mavel-fsp, React-profile(this project)

        </p>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Environment / Technologies
                </h4>
              <p>
                Java, Spring/Springboot, MySQL, React, JavaScript, HTML/CSS, and Angular.
          </p>
              <hr></hr>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                <a href="https://github.com/csanders29/CartProject">Shopping Cart Project</a>
              </h4>
              <p>
                A full stack shopping cart Project using MySQL, SpringBoot, React, and Java.
        </p>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Environment / Technologies
                </h4>
              <p>
                Java, Spring Boot, MySQL, React, and CSS.
          </p>
              <hr></hr>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                <a href="https://github.com/csanders29/TeamProject">Snake Game</a>
              </h4>
              <p>
                A simple game using Java GUI.
        </p>
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Environment / Technologies
                </h4>
              <p>
                Java, Java GUI
          </p>
              <hr></hr>


            </div>
          </div>

          <div className="equivPanel5">
            <div className="equivHeader5" >
              <img src={GenSparkPic} alt="alt" className="keyboardPic" />
          Working Experiences
      </div>
            <div className="equivBody5">
              <h4 style={{ fontSize: 24, fontWeight: 400, marginBottom: 5, marginTop: 9 }}>
                Java Full Stack Developer
      </h4>
              <h5 style={{ marginBottom: 10, fontSize: 20, color: '#fac252', fontWeight: 400, marginTop: 9 }}>
                GenSpark
      </h5>
              <h4 style={{ marginBottom: 10, fontSize: 18, fontWeight: 600, marginTop: 9 }}>
                April 2021 - PRESENT
      </h4>

              <hr style={{ borderWidth: 5, borderColor: '#fac252' }}></hr>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
