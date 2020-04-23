import React, { Component } from "react";

class Login extends Component {
  render() {
    return (
      <div className="row p-5 mt-5">
        <div className="col-lg-7 col-sm-12">
          <img src={require('../Navbar/Outreachimage.jpg')} width="100%" height="85%" alt="Img not Supported" />
        </div>
        <div className="col-lg-4 col-sm-12 text-primary-color">
          <div className="card shadow p-4 mb-5 bg-white rounded">
            <div className="card-body">
              <h4 className="text-center text-primary logo-color ">
                <i className="fa fa-handshake-o fa-2"></i> Cognizant Outreach
          </h4>
              <h4 className="card-title text-center mb-4">Feedback Management System</h4>
              <form action="/dashboard">
                <div className="form-group">
                  <div className="input-group">
                    <div className="input-group-prepend ">
                      <span className="input-group-text">
                        <i className="fa fa-user"></i>
                      </span>
                    </div>
                    <input
                      type="text"
                      className="form-control"
                      id="InputEmail"
                      placeholder="Enter email"
                      formControlName="email_id"/>
                    <div className="invalid-feedback">
                      <div>Email is required</div>
                      <div>Email must be valid</div>
                    </div>
                  </div>
                  <div className="input-group">
                    <div className="input-group-prepend">
                      <span className="input-group-text">
                        <i className="fa fa-lock"></i>
                      </span>
                    </div>
                    <input
                      type="password"
                      className="form-control"
                      id="InputPassword"
                      placeholder="Enter Password"
                      formControlName="password"/>
                    <div className="invalid-feedback">
                      <div>Password is required</div>
                    </div>
                  </div>
                </div>
                <div className="form-check mt-2 mb-3">
                  <label class="form-check-label" for="exampleCheck1"><strong>Remember me</strong></label>
                </div>
                <div className="form-group">
                  <button
                    type="submit"
                    className="btn btn-success btn-block main-color">
                    SIGN ME IN
                </button>
                </div>
                <p className="text-center">
                  <a id="navigate_signup" href="sign-up">
                    Interested in Outreach? Click to register for next event
                </a>
                </p>
              </form>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
export default Login;
