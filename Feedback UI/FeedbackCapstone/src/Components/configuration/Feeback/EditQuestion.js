import React, { Component } from 'react';

const EditQuestion = () => {
    return (

        <div className=" card-body  mt-2">
        <div className="py-2 text-white" style={{ backgroundColor: '#0000b3' }}>
     <h5 className="font-weight-bold ml-3">Edit Question</h5>
     </div>
        <div className="container card card-body">
    <form>
        <div className="form-group row">
            
            <div className="col-lg-3 col-md-12  col-form-label form-check form-check-inline">
                <h6>Feedback Type</h6>
                
            </div>
            <div className="form-check form-check-inline">                
                <input type="radio" name="participated" id="" className='form-check-input'/>
                <h6>Participated</h6>
                
            </div>
            <div className="form-check form-check-inline">
                <input type="radio" name="notparticipated" id="" className='form-check-input'/>
                <h6>Not Participated</h6>
                
            </div>
            <div className="form-check form-check-inline">
                <input type="radio" name="unregistered" id="" className='form-check-input'/>
               <h6>Unregistered</h6>
            </div>
            
        </div>
        
        <div className="form-group row">
            <div className="form-check col-12 m-2">
                <input className="form-check-input" type="checkbox" value="" id="defaultCheck1"/>
                 
                <h6>Allow Multiple Answers</h6>
            </div>
            <div className="form-check col-12 m-2">
                <input className="form-check-input" type="checkbox" value="" id="defaultCheck2" />
                
                <h6>Free Text Answer</h6>
            </div>
            <div className="form-check col-12 m-2">
                <input className="form-check-input" type="checkbox" value="" id="defaultCheck2"/>
                
                <h6>Custom Question</h6>
            </div>
        </div>
        
        
        <div className="form-group row">
            <div className="col-3 col-form-label form-check form-check-inline">
           <h6>Question </h6>
            </div>

            <div className="col-8 col-form-label form-check form-check-inline">
                <input type="text" name="" id="" placeholder="Description (required)" className='form-control'/>
            </div>
        </div>
        
        <div className="form-group row">
            <div className="col-3 col-form-label form-check form-check-inline">
                    <h6>Answer 1</h6>
                    
            </div>            
            <div className="col-8 col-form-label form-check form-check-inline">
                <input type="text" name="" id="" placeholder="Answer 1" className='form-control'/>
                <button className="btn btn-warning text-center text-light p-0 m-1">DELETE ANSWER</button>
            </div>
        </div>
        
        <div className="form-group row">
            <div className="col-3 col-form-label form-check form-check-inline">
           <h6>Answer 2</h6>
            </div>            
            <div className="col-8 col-form-label form-check form-check-inline">
                <input type="text" name="" id="" placeholder="Answer 2" className='form-control'/>
                <button className="btn btn-warning text-center text-light p-0 m-1">DELETE ANSWER</button>
            </div>
        </div>
            
        <div className="form-group row">
            <div className="col-3 col-form-label form-check form-check-inline">
            <h6>Answer 3</h6>
            </div>            
            <div className="col-8 col-form-label form-check form-check-inline">
                <input type="text" name="" id="" placeholder="Answer 3" className='form-control'/>
                <button className="btn btn-warning text-center text-white p-0 m-1">DELETE ANSWER</button>
            </div>
        </div>

        <div className="form-group row">
            <div className="col-3 col-form-label form-check form-check-inline">
            <h6>Answer 4</h6>
            </div>            
            <div className="col-8 col-form-label form-check form-check-inline">
                <input type="text" name="" id="" placeholder="Answer 4" className='form-control'/>
                <button className="btn btn-warning text-center text-white p-0 m-1">DELETE ANSWER</button>
            </div>
        </div>
        
        <div className="form-group row">
                <button className="btn btn-success text-center text-white col-1">ADD ANSWER</button>
        </div>
        
        <div className="form-group row">
            <div className="col-3"></div>
            <div className="col">
                <button className="btn btn-primary px-3 m-1 text-center ">
                        SAVE
                </button>
                <button className="btn btn-secondary px-3 m-1 text-center">
                    CANCEL
                </button>
                <button className="btn btn-danger px-3 m-1 text-center">
                    DELETE
                </button>
            </div>
           
        </div>
        </form>
    </div>
    </div>

    );
}

export default EditQuestion;