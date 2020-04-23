import React, { useState, useEffect } from "react";
import axios from 'axios';
import { Link } from "react-router-dom";
import EventAction from "./EventAction";

const EventDetails = () => {

  return (
    <div>
      <div className="container col-lg-12 mt-2">
                <EventAction />
            </div>
    <div className="container col-lg-12 mt-2 pb-3">
      <div className="card" >
        <div className="card-header" style={{ backgroundColor: '#0000b3' }}>
          <p className="text-white">EVENT AND BENIFICIARY DETAILS</p>
        </div>
        <div className="card-body">
    <div>
      <div className="row mb-4">
        <div className="col-lg-6 col-md-6 col-sm-6 col-xs-6">
          <div className="card ">
            <div className="card-header text-white" style={{ backgroundColor: '#0000b3' }}>
              <span className="text-white" style={{ float: "left" }}>ID : EVNT00047261</span>
              <span className="text-white" style={{ float: "right" }}>Date : 15/12/2018</span>
            </div>
            <div className="card-body">
              <h5 className="card-title">Bags of Joy Distribution</h5>
              <p className="card-text">"Thank you for all your donations of food items to make this a good Xmas for everyone! Come be a Santa and distribute these Bags of Joy to elderly low income residents in Central Singapore and feel the joy of giving!
              Friends and family welcome!"</p>

            </div>
            <div className="card-footer text-light">
            <span className="text-white" style={{float:"left"}}>Status : <span className="badge badge-success">Approved</span></span>
              <span className="text-white" style={{ float: "right" }}>Category : Donation or Distribution</span>
            </div>
          </div>
        </div>
        <div className="col-lg-6 col-md-6 col-sm-6 col-xs-6">
          <div className="card">
            <div className="card-header text-white"style={{ backgroundColor: '#0000b3' }}>
              <span className="text-white" style={{ float: "left" }}>Location : Singapore</span>
              <span className="text-white" style={{ float: "right" }}>Council : Outreach Singapore</span>
            </div>
            <div className="card-body">
              <h5 className="card-title">KWONG WAI SHIU HOSPITAL</h5>
              <p className="card-text">705, Serangoon Road, Singapore, Singapore, Singapore-328127</p>

            </div>
            <div className="card-footer">
              <span className="text-white" style={{ float: "left" }}>
                Feedback : <span className="badge badge-warning">6</span>
              </span>
              <span className="text-white" style={{ float: "right" }}>
                Average Rating : <span className="badge badge-primary">5</span>
              </span>
            </div>
          </div>
        </div>
      </div>
      <div className="row mb-4">
        <div className="col-lg-4 col-md-4 col-sm-4 col-xs-4">
          <div className="card text-center">
            <div className="card-header text-white" style={{ backgroundColor: '#0000b3' }}>
              PARTICIPATED
                            </div>
            <div className="card-body">
              <p className="card-text">Likes : 4</p>
              <p className="card-text">Rating : 5</p>
              <p className="card-text">Dislikes: Travel</p>
            </div>
          </div>
        </div>
        <div className="col-lg-4 col-md-4 col-sm-4 col-xs-4">
          <div className="card text-center">
            <div className="card-header text-white" style={{ backgroundColor: '#0000b3' }}>
              NOT PARTICIPATED
                            </div>
            <div className="card-body">
              <p className="card-text">Unexpected office work</p>
              <p className="card-text">Not well</p>
            </div>
          </div>
        </div>
        <div className="col-lg-4 col-md-4 col-sm-4 col-xs-4">
          <div className="card text-center">
            <div className="card-header text-white "style={{ backgroundColor: '#0000b3' }}>
              UNREGISTERED
                            </div>
            <div className="card-body">
               <p className="card-text">Did not receive further information about the event.</p>
            </div>
          </div>
        </div>
      </div>
      <div className="row mb-4">
        <div className="col-lg-6 col-md-6 col-sm-6 col-xs-6">
          <div className="card text-center">
            <div className="card-header text-white " style={{ backgroundColor: '#0000b3' }}>
              STATISTICS
                            </div>
            <div className="card-body">
              <table className="table table-sm">
                <thead className="thead-light">
                  <tr>
                    <th scope="col">Average Rating</th>
                    <th scope="col">Volunteers</th>
                    <th scope="col">Volunteering Hours</th>
                    <th scope="col">Overall Hours</th>
                    <th scope="col">Travel Hours</th>
                    <th scope="col">Lives Impacted</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">4</th>
                    <td>21</td>
                    <td>88</td>
                    <td>130</td>
                    <td>42</td>
                    <td>800</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
        <div className="col-lg-6 col-md-6 col-sm-6 col-xs-6">
          <div className="card text-center">
            <div className="card-header text-white"  style={{ backgroundColor: '#0000b3' }}>
              POC DETAILS
                            </div>
            <div className="card-body">
              <table className="table">
                <thead className="thead-light">
                  <tr>
                    <th scope="col">#</th>
                    <th scope="col">Employee ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Contact Number</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>602347</td>
                    <td>Ranjith Kumar</td>
                    <td>1235468458</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
    </div>
    </div>
    </div>
    </div>
  )

};

export default EventDetails;