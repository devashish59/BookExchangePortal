import './App.css';
import {BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ListUserComponent from './components/ListUserComponent';
// import AddUserComponent from './components/AddUserComponent';

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />
        <div className= "container">
          <Switch>
              <Route exact path = "/" component = {ListUserComponent}></Route>
              <Route path = "/user" component = {ListUserComponent}></Route>
              {/* <Route path = "/add-User" component = {AddUserComponent} ></Route>
              <Route path = "/edit-User/:id" component = {AddUserComponent}></Route> */}
            </Switch>
        </div>
        <FooterComponent />
        </Router>
    </div>
  );
}
// function App() {
//   return (
//     <div>
//       <Router>
//         <HeaderComponent />
//         <div className= "container">
//            <Switch>
//                <Route exact path = "/" component = {ListUserComponent}></Route>
//                <Route path = "/user" component = {ListUserComponent}></Route>
//             </Switch>
//         </div>
//         <FooterComponent />
//       </Router>
//     </div>
//   );
// }

export default App;
