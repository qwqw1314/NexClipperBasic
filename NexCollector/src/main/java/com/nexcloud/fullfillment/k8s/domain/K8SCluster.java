/*
* Copyright 2019 NexCloud Co.,Ltd.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.nexcloud.fullfillment.k8s.domain;
public class K8SCluster {
	private Integer cpu;
	
	private Integer pod;
	
	private Double mem;
	
	private Double used_cpu;
	
	private Double used_mem;
	
	private Integer used_pod;
	
	private Double used_percent_cpu;
	
	private Double used_percent_mem;
	
	private Double used_percent_pod;

	public Integer getCpu() {
		return cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	public Integer getPod() {
		return pod;
	}

	public void setPod(Integer pod) {
		this.pod = pod;
	}

	public Double getMem() {
		return mem;
	}

	public void setMem(Double mem) {
		this.mem = mem;
	}

	public Double getUsed_cpu() {
		return used_cpu;
	}

	public void setUsed_cpu(Double used_cpu) {
		this.used_cpu = used_cpu;
	}

	public Double getUsed_mem() {
		return used_mem;
	}

	public void setUsed_mem(Double used_mem) {
		this.used_mem = used_mem;
	}

	public Integer getUsed_pod() {
		return used_pod;
	}

	public void setUsed_pod(Integer used_pod) {
		this.used_pod = used_pod;
	}

	public Double getUsed_percent_cpu() {
		return used_percent_cpu;
	}

	public void setUsed_percent_cpu(Double used_percent_cpu) {
		this.used_percent_cpu = used_percent_cpu;
	}

	public Double getUsed_percent_mem() {
		return used_percent_mem;
	}

	public void setUsed_percent_mem(Double used_percent_mem) {
		this.used_percent_mem = used_percent_mem;
	}

	public Double getUsed_percent_pod() {
		return used_percent_pod;
	}

	public void setUsed_percent_pod(Double used_percent_pod) {
		this.used_percent_pod = used_percent_pod;
	}
}
