import React, { useEffect, useState } from 'react';
import axios from 'axios';


const Dashboard = React.memo(props => {

    const [dashboardData, setDashboardData] = useState({});
    const [dataFetch, setDataFetch] = useState(false);

    useEffect(() => {
        axios("/FeedbackEventService/dashboard",
            { headers: { 'Content-Type': 'application/json' } })
            .then((response) => {
                setDashboardData(response.data);
                setDataFetch(true);
            }, (error) => {
                console.log(error);
            })
    }, [])

    return (
        <div>
            <div className="container-fluid">
                <div className="row mb-3 mt-2">
                    <div className="col-xl-3 col-sm-6 py-2">
                        <div className="card bg-gradient-danger text-white h-100">
                            <div className="card-body bg-gradient-danger animated fadeIn delay-2s">
                                <div className="rotate">
                                    <i className="fa fa-desktop fa-4x"></i>
                                </div>
                                <h6 className="text-uppercase">Total Events</h6>
                                <h3 className=" font-weight-normal display-4">8</h3>
                                {/* <h1 className="display-4">{this.state.totalEvents}</h1> */}
                            </div>
                            <div className="card-footer d-flex justify-content-end p-0">
                                <a href="/eventlist" className="btn btn-link text-white d-flex align-items-center"
                                >View Detail
                                      <i className="fa 1 ml-2 fa-arrow-circle-right" aria-hidden="true"></i>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div className="col-xl-3 col-sm-6 py-2">
                        <div className="card bg-gradient-warning text-white h-100">
                            <div className="card-body bg-gradient-warning animated fadeIn delay-1s">
                                <div className="rotate">
                                    <i className="fa fa-link fa-4x"></i>
                                </div>
                                <h6 className="text-uppercase">Lives impacted</h6>
                                <h3 className=" font-weight-normal display-4">877</h3>
                                {/* <h1 className="display-4">{this.state.livesImpacted}</h1> */}
                            </div>
                            <div className="card-footer d-flex justify-content-end p-0">
                                <a href="/eventlist" className="btn btn-link text-white d-flex align-items-center"
                                >View Detail
                                      <i className="fa 1 ml-2 fa-arrow-circle-right" aria-hidden="true"></i>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div className="col-xl-3 col-sm-6 py-2">
                        <div className="card bg-gradient-primary text-white h-100">
                            <div className="card-body bg-gradient-primary animated fadeIn delay-2s">
                                <div className="rotate">
                                    <i className="fa fa-users fa-4x"></i>
                                </div>
                                <h6 className="text-uppercase">Total Volunteers</h6>
                                <h3 className=" font-weight-normal display-4">45</h3>
                                {/* <h1 className="display-4">{this.state.totalVolunteers}</h1> */}
                            </div>
                            <div className="card-footer d-flex justify-content-end p-0">
                                <a href="/eventlist" className="btn btn-link text-white d-flex align-items-center"
                                >View Detail
                                      <i className="fa 1 ml-2 fa-arrow-circle-right" aria-hidden="true"></i>
                                </a>
                            </div>
                        </div>
                    </div>


                    <div className="col-xl-3 col-sm-6 py-2 ">
                        <div className="card text-white bg-gradient-dark h-100">
                            <div className="card-body bg-gradient-dark animated fadeIn delay-1s">
                                <div className="rotate">
                                    <i className=" fa fa-clock fa-4x"></i>
                                </div>
                                <h6 className="text-uppercase">Total Participants</h6>
                                <h3 className=" font-weight-normal display-4">15</h3>
                                {/* <h1 className="display-4">{this.state.totalParticipants}</h1> */}
                            </div>
                            <div className="card-footer d-flex justify-content-end p-0">
                                <a href="/eventlist" className="btn btn-link text-white d-flex align-items-center"
                                >View Detail
                                      <i className="fa 1 ml-2 fa-arrow-circle-right" aria-hidden="true"></i>
                                </a>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    )
}
);
const mapStateToProps = state => {
    return {
        Users: state.userData

    };
};
export default Dashboard;
