import React from 'react';
import './status_label.css';

const StatusLabel = (props) => {
  return (
    <div className='dw_status'>
      <p>{props.status}</p>
    </div>
  )
}

export default StatusLabel