/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * DescribeDBSecurityGroups action.
 * </p>
 */
public class DescribeDBSecurityGroupsResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>DBSecurityGroup</a> instances.
     */
    private java.util.List<DBSecurityGroup> dBSecurityGroups;

    /**
     * The marker obtained from a previous operation response.
     *
     * @return The marker obtained from a previous operation response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @param marker The marker obtained from a previous operation response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker obtained from a previous operation response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A list of <a>DBSecurityGroup</a> instances.
     */
    public java.util.List<DBSecurityGroup> getDBSecurityGroups() {
        
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new java.util.ArrayList<DBSecurityGroup>();
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     */
    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroup> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        java.util.List<DBSecurityGroup> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroup>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsResult withDBSecurityGroups(DBSecurityGroup... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) setDBSecurityGroups(new java.util.ArrayList<DBSecurityGroup>(dBSecurityGroups.length));
        for (DBSecurityGroup value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSecurityGroupsResult withDBSecurityGroups(java.util.Collection<DBSecurityGroup> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
        } else {
            java.util.List<DBSecurityGroup> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroup>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (dBSecurityGroups != null) sb.append("DBSecurityGroups: " + dBSecurityGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeDBSecurityGroupsResult == false) return false;
        DescribeDBSecurityGroupsResult other = (DescribeDBSecurityGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null) return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    