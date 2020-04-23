import React, { Component } from "react";
import {
    MDBNavbar, MDBNavbarBrand, MDBNavbarNav, MDBNavItem, MDBNavLink, MDBNavbarToggler, MDBCollapse, MDBDropdown,
    MDBDropdownToggle, MDBDropdownMenu, MDBDropdownItem, MDBIcon
} from "mdbreact";
import { NavLink } from 'react-router-dom';

class Navbar extends Component {
    constructor(props) {
        super(props);
    }
    state = {
        isOpen: false
    };

    toggleCollapse = () => {
        this.setState({ isOpen: !this.state.isOpen });
    }

    render() {
        return (
            <div className="mb mdbnav">
                <MDBNavbar dark expand="md">
                    <MDBNavbarBrand>
                         <i className="px-2 fa fa-handshake-o fa-2"></i>
                        <strong>Outreach</strong>FMS
                            </MDBNavbarBrand>
                            <MDBNavbarToggler onClick={this.toggleCollapse} />
                                <MDBCollapse id="navbarCollapse3" isOpen={this.state.isOpen} navbar>
                                        <MDBNavbarNav left>
                                        <MDBNavItem >
                                                <MDBNavLink exact to="/dashboard"  > <i
                                                    className="fa fa-th-large pr-1"
                                                    aria-hidden="true" /> DashBoard
                                                </MDBNavLink>
                                            </MDBNavItem>
                                        
                                        <MDBNavItem >
                                            <MDBNavLink exact to="/eventlist"> <i className="fa fa-arrow-circle-right" /> Events</MDBNavLink>
                
                                        </MDBNavItem>
                                        <MDBNavItem>
                                            <MDBNavLink to="/report"> <i className="fa fa-file-excel-o pr-1" /> Reports</MDBNavLink>
                                        </MDBNavItem>
                                        
                                        <MDBNavItem>
                                            <MDBDropdown >
                                                <MDBDropdownToggle nav caret>
                                                    <i className="fa fa-cog" /> <div className="d-none d-md-inline">Configuration</div>
                                                </MDBDropdownToggle>
                                                <MDBDropdownMenu >
                                                    <NavLink to="/roles" ><MDBDropdownItem>Roles</MDBDropdownItem></NavLink>
                                                    <NavLink to="/Feedbackquestions"><MDBDropdownItem >Feedback Questions</MDBDropdownItem> </NavLink>
                                                </MDBDropdownMenu>
                                            </MDBDropdown>
                                </MDBNavItem>
                        </MDBNavbarNav>
                        <MDBNavbarNav right>
                        
                            <MDBNavItem>
                                <MDBDropdown>
                                    <MDBDropdownToggle nav caret>
                                            <a data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <i className="fa fa-user-circle" aria-hidden="true"></i> Admin
                                            </a>
                                    </MDBDropdownToggle>
                                    <MDBDropdownMenu className="dropdown-menu px-3">
                                            <MDBDropdownItem href="/">Logout</MDBDropdownItem>
                                    </MDBDropdownMenu>
                                </MDBDropdown>
                            </MDBNavItem>
                        </MDBNavbarNav>
                    </MDBCollapse>
                </MDBNavbar>
            </div >
        );
    }
}

const mapStateToProps = state => {
    return {
        Users: state.userData

    };
};


export default Navbar;