import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Route, Switch, Link, BrowserRouter as Router } from "react-router-dom";
import Navbar from './Components/Navbar/Navbar';
import Dashboard from './Components/Navbar/Dashboard';
import Footer from './Components/Footer/Footer';
import Login from './Components/Navbar/Login';
import EventDetails from './Components/Events/EventDetails';
import Report from './Components/Report/Report';
import FeedbackQuestions from './Components/configuration/Feeback/FeedbackQuestions';
import EditQuestion from './Components/configuration/Feeback/EditQuestion';
import EventList from './Components/Events/Eventlist';
import ReportAction from './Components/Report/ReportsAction';
import Roles from './Components/configuration/Roles/Roles';
import AddQuestion from './Components/configuration/Feeback/AddQuestion';
import EventAction from './Components/Events/EventAction';



function App() {
  return (
    <Router>
      {
        window.location.pathname === '/' ? '' : <Navbar />
      }
      <Switch>
        <Route exact path="/" component={Login} />
        <Route path="/dashboard" component={Dashboard} />
        <Route path="/eventaction" component={EventAction} />
        <Route path="/eventlist" component={EventList} />
        <Route path="/event/eventdetails" component={EventDetails} />
        <Route path="/reportaction" component={ReportAction} />
        <Route path="/report" component={Report} />
        <Route path="/roles" component={Roles} />
        <Route path="/Feedbackquestions" component={FeedbackQuestions} />   
        <Route path="/addquestion/" component={AddQuestion} />
        <Route path="/editquestion" component={EditQuestion} />
      </Switch>
      <Footer />
    </Router>
  );
}

export default App;
