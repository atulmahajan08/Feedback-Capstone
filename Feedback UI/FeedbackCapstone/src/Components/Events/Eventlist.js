import EventAction from './EventAction';
import React, { useState, useEffect } from "react";
import axios from "axios";
import { Link } from "react-router-dom";


const EventList = () => {

    const [eventList, setEventList] = useState([]);
    const [showLoading, setShowLoading] = useState(true);
    const [sendMailStatus, setSendMailStatus] = useState(false);

    useEffect(() => {
        const fetchData = async () => {
            const result = await axios("/event/importEvents");
            setEventList(result);
            setShowLoading(false);
        };

        fetchData();
    }, []);

    const sendMail = () => {
        setShowLoading(true);
        axios("/email/sendEmail").then(
            res => {
                console.log("res", res);
                if (res.data == true) {
                    setSendMailStatus(true);
                }
                setShowLoading(false);
            }
        );
    }

    return (
        <div>
            <div className="container col-lg-12 mt-2">
                <EventAction />
            </div>
            <div className="card px-2 pb-3" >
                <div className="py-2 text-white" style={{ backgroundColor: '#0000b3' }}>
                    <h5 className="font-weight-bold ml-3">Events</h5></div>

                <div className="d-flex flex-row-reverse">
                    <button className="btn btn-primary text-white m-1">
                        <i className="fa fa-file-excel-o"> DOWNLOAD EXCEL</i>
                    </button>
                    <button className="btn btn-danger text-white m-1">
                        <i className="fa fa-window-close"> CLEAR FILTERS</i>
                    </button>
                </div>
                <div className="card">
                    <div className="card-body">
                        <div className="table-responsive">
                            <table className="table table-sm table-bordered">
                                <thead>
                                    <tr>
                                        <th >Action</th>
                                        <th scope="col">Event ID
                      <input type="text" className="form-control" placeholder="filter column" /></th>
                                        <th scope="col">Month
                      <input type="password" className="form-control" placeholder="filter column" /></th>
                                        <th scope="col">Base Location
                      <input type="password" className="form-control" placeholder="filter column" /></th>
                                        <th scope="col">Council Name
                      <input type="password" className="form-control" placeholder="filter column" /></th>
                                        <th scope="col">Beneficiary Name
                      <input type="password" className="form-control" placeholder="filter column" /></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">
                                            <a href="/event/eventdetails" className="btn btn-primary">View</a>
                                        </th>
                                        <td>EVNT00047261</td>
                                        <td>Dec</td>
                                        <td>Singapore</td>
                                        <td>Outreach Singapore</td>
                                        <td>KWONG WAI SHIU HOSPITAL</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default EventList;