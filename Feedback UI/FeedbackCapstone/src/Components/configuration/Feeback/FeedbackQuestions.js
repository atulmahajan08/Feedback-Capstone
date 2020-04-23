import React, { Component } from 'react';


const FeedbackQuestions = () => {
    return (
        <div>
        <div className="float-right">

        <a href="/addquestion" className="btn btn-success m-2"><i className="fa fa-plus mr-1"></i>Add Question</a>
            <button className="btn btn-danger m-2">
                <i className="fa fa-times mr-1" aria-hidden="true"></i>CLEAR FILTERS
            </button>
        </div>
            <div className="table-responsive">            
                <table className="table  table-hover table-bordered">
                   <thead>
                       <tr>
                            <th><b className='text-muted'>Question</b> <i className="fa fa-fw fa-sort float-right"></i></th>
                            <th><b className='text-muted'>Total Answers</b> <i className="fa fa-fw fa-sort  float-right"></i></th>
                            <th><b className='text-muted'>Feedback Type</b> <i className="fa fa-fw fa-sort  float-right"></i></th>
                            <th><b className='text-muted'>Action</b> <i className="fa fa-fw fa-sort  float-right"></i></th>
                       </tr>
                   </thead>
                   <tbody>
                       <tr>
                           <td>Hey there, Please share your feedback for unregistered events?</td>
                           <td>6</td>
                           <td>unregistered</td>
                           <td>
                               <a href="/editquestion" className="btn btn-primary">
                                   <i className="fa fa-edit mr-1"></i>Edit
                                </a>
                            </td>
                       </tr>
                       
                        <tr>
                            <td>How do you rate the overall event?</td>
                            <td>5</td>
                            <td>participated</td>
                            <td>
                                <a href="/editquestion" 
                                  className="btn btn-primary">
                                    <i className="fa fa-edit mr-1"></i>Edit
                                </a>
                             </td>
                        </tr>

                        <tr>
                            <td>What did you like about the volunteering activity?</td>
                            <td>0</td>
                            <td>participated</td>
                            <td>
                                <a href="/editquestion" 
                                  className="btn btn-primary">
                                    <i className="fa fa-edit mr-1"></i>Edit
                                </a>
                             </td>
                        </tr>
                        
                        <tr>
                                <td>What can be improved in this volunteering activity?</td>
                                <td>0</td>
                                <td>participated</td>
                                <td>
                                    <a href="/editquestion"
                                  className="btn btn-primary">
                                        <i className="fa fa-edit mr-1"></i>Edit
                                    </a>
                                 </td>
                        </tr>
                   </tbody>
                </table>
            </div>
            </div>
        );
}

export default FeedbackQuestions;