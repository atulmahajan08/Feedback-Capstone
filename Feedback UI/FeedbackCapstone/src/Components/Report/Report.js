import React from 'react';
import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table-plus';
import Axios from 'axios';
import ReportAction from './ReportsAction';

class Report extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            data: []
        }
    }

    componentDidMount = () => {
        Axios.get('http://localhost:8003/eventReport', { headers: { 'Content-Type': 'application/json' } }).then(res => {
            if (res.status == '200') {
                this.eventTableHandler(res.data)
            }
        }).catch(function (error) {
            console.log("error:", error);
        });
    }

    eventTableHandler = (eventdata) => {
        eventdata.filter((event) => {
            this.state.data.push(event.body)
        })
        this.setState({ data: this.state.data })
    }

    handlerClickCleanFiltered() {
        this.refs.clear2.cleanFiltered();
        this.refs.clear3.cleanFiltered();
        this.refs.clear4.cleanFiltered();
        this.refs.clear5.cleanFiltered();
        this.refs.clear6.cleanFiltered();
    }

    render() {
        const options = {
            prePage: 'Prev',
            nextPage: 'Next',
            firstPage: 'First',
            lastPage: 'Last',
            hideSizePerPage: true,

        };

        return (
            <div>
                <div class="container-fluid mt-2 pb-3" >
                    <ReportAction />
                    <div className="card px-2 " >
                        <div class="py-2 text-white" style={{ backgroundColor: '#0000b3' }}>
                            <h5 class="font-weight-bold ml-3">Events</h5></div>

                        <div class="d-flex flex-row-reverse">
                            <button class="btn btn-primary text-white m-1">
                                <i class="fa fa-file-excel-o"> DOWNLOAD EXCEL</i>
                            </button>
                            <button class="btn btn-danger text-white m-1">
                                <i class="fa fa-window-close"> CLEAR FILTERS</i>
                            </button>
                        </div>
                        <div className="card">
                            <div className="table-responsive">
                                <table className="table table-sm table-bordered">
                                    <thead>
                                        <tr>
                                            <th scope="col">Event ID
                      <input type="text" class="form-control" placeholder="filter column" /></th>
                                            <th scope="col">Month
                      <input type="password" class="form-control" placeholder="filter column" /></th>
                                            <th scope="col">Base Location
                      <input type="password" class="form-control" placeholder="filter column" /></th>
                                            <th scope="col">Council Name
                      <input type="password" class="form-control" placeholder="filter column" /></th>
                                            <th scope="col">Beneficiary Name
                      <input type="password" class="form-control" placeholder="filter column" /></th>
                                            <th scope="col">Project
                      <input type="password" class="form-control" placeholder="filter column" /></th>
                                            <th scope="col">Business Unit
                      <input type="password" class="form-control" placeholder="filter column" /></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>EVNT00047261</td>
                                            <td>Dec</td>
                                            <td>Singapore</td>
                                            <td>Chennai BFS Outreach</td>
                                            <td>Kamarajar Illam,Tambaram</td>
                                            <td>Donation or Distribution</td>
                                            <td>Banking & Financial Services</td>
                                        </tr>
                                        <tr>
                                            <td>EVNT00046103</td>
                                            <td>Dec</td>
                                            <td>Chennai</td>
                                            <td>Outreach Singapore</td>
                                            <td>KWONG WAI SHIU HOSPITAL</td>
                                            <td> Be a Teacher</td>
                                            <td>Field Marketing</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        )

    }
}
export default Report;