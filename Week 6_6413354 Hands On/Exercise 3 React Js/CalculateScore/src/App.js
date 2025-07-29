import React from 'react';
import CalculateScore from './components/CalculateScore';
import './Stylesheets/mystyle.css';

function App() {
  return (
    <div className="App">
      <CalculateScore Name="Steeve" School="DNV Public School" total={85} goal={100} />
    </div>
  );
}

export default App;