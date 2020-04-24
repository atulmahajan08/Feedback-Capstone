import React, { useState, useEffect } from "react";
import axios from "axios";

const ReportAction = () => {
	
    const [showLoading, setShowLoading] = useState(true)
    const [sendMailStatus, setSendMailStatus] = useState(false);

    const sendMail = () => {
        console.log("inside send mail");
        if (window.confirm('Mail has been sent Successfully!!!')) {
        setShowLoading(true);
        axios("/FeedbackEmailService/sendEmail", 
        { headers: { 'Content-Type': 'application/json'}})
        .then(
            res => {
                console.log("res", res);
                if (res.data == "success") {
                    setSendMailStatus(true);
                }
                setShowLoading(false);
            }
        );
      }
    }

    return (
    <div >
        <div className="py-2 text-white" style={{ backgroundColor: '#0000b3' }}> <h5 className="font-weight-bold ml-3">Actions</h5></div>

        <div className="row mb-3 mt-2">

            <div className="col-xl-6 col-sm-6 py-2">
                <div className="card text-white bg-info h-100">
                    <div className="card-body bg-info">
                        <div className="rotate">
                            <i className="fas fa-file-excel fa-4x"></i>
                        </div>
                        <h6 className="text"><b>Email Report!</b></h6>

                        <label for="staticEmail2" className="sr-only">Email</label>
                        <form className="form-inline">
                            <div className="form-group mb-2">
                                <strong className="font-weight-Normal">Employee ID</strong>
                            </div>
                            <div className="form-group mx-sm-3 mb-2">
                                <input type="text" className="form-control" placeholder="Enter Email Address" />
                            </div>
                            <button type="submit" className="btn btn-dark mb-2">Send Email</button>
                        </form>
                    </div>

                </div>
            </div>

            <div className="col-xl-6 col-sm-6 py-2">
                <div className="card bg-warning h-100">
                    <div className="card-body  ">
                        <div className="rotate">
                            <i className="fa fa-lightbulb fa-4x"></i>
                        </div>
                        <h6 className="px-2 text-danger text-right"><b>Future Implementation!</b></h6>
                        <p className=" px-2 text-right font-weight-bold text-danger small ">This Placeholder can be use for adding any other actions in  future.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    );
}

export default ReportAction;