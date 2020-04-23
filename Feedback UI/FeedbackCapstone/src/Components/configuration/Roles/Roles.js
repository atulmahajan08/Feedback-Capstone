import React, { Component } from 'react';


const Roles = () => {
  return (
    <div className="container col-lg-12 mt-2 pb-3">
      <div className="card ">
        <div className="card-header text-white" style={{ backgroundColor: '#0000b3' }}>
          ASSIGN PMO
        </div>
        <div className="card-body">
          <form className="form-inline">
            <div className="form-group mb-2">
              <h4>Employee ID</h4>
            </div>

            <div className="form-group mx-sm-3 mb-2">
              <input type="password" className="form-control" placeholder="Enter Email Address" />
            </div>
            <button type="submit" className="btn btn-success mb-2 mr-2">ADD PMO</button>
            <button type="submit" className="btn btn-danger mb-2">Remove PMO</button>
          </form>
        </div>
      </div>


      <div className="card mt-2">
        <div className="card-header text-white" style={{ backgroundColor: '#0000b3' }}>
          PMO USERS
        </div>
        <div className="card px-2" >
          <div className="d-flex flex-row-reverse">
            <button className="btn btn-primary text-white m-1">
              <i className="fa fa-file-excel-o"> DOWNLOAD EXCEL</i>
            </button>
            <button className="btn btn-danger text-white m-1">
              <i className="fa fa-window-close"> CLEAR FILTERS</i>
            </button>
          </div>
          <div className="card-body">
            <div className="table-responsive">
              <table className="table table-sm table-bordered">
                <thead>
                  <tr>
                    <th scope="col">Email</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>abc@cognizant.com</td>
                    <td>ABC</td>
                    <td>XYZ</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>

  );
};

export default Roles;
