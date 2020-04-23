import React, { Component } from 'react';


const EventAction = () => {
    return (
        <div>
            <div className="py-2 text-white" style={{ backgroundColor: '#0000b3' }}> <h5 className="font-weight-bold ml-3">Actions</h5></div>

            <div className="row mb-3 mt-2">

                <div className="col-xl-6 col-sm-6 py-2">

                    <div className="card text-white bg-info h-100">
                        <div className="card-body bg-info">
                            <div className="rotate">
                                <i className="fa fa-envelope fa-4x"></i>
                            </div>
                            <h6 className="text"><b>Email Reminder!</b></h6>
                            <form className="form-inline">
                                <div className="form-group mb-2">
                                    <h5 className="text-dark font-weight-Normal">Sit back and relax while app  send emails!!</h5>
                                </div>
                                <div className="form-group mx-sm-3 mb-2">
                                    <button type="submit" className="btn btn-light mb-2">Send Email</button>
                                </div>
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
                            <h6 className="px-2 text-danger text-right"><b>Future Implementations!</b></h6>
                            <p className=" px-2 text-right font-weight-bold text-danger small ">This Placeholder can be use for adding any other actions in  future.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );

}

export default EventAction;

