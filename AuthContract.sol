// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract AuthContract {
    mapping(address => bool) public registeredUsers;

    function registerUser() public {
        registeredUsers[msg.sender] = true;
    }

    function authenticateUser(address user) public view returns (bool) {
        return registeredUsers[user];
    }
}