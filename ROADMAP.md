# Roadmap 2023

Welcome to the Cosmos SDK's team roadmap. 

> This document is meant to help the team get feedback on the proposed work and for others to follow where we stand in our process. This will be a living document updated on a regular basis. If you'd like to participate in any workscope or would like to suggest another feature please reach out to [Marko](marko@binary.builders) or [Sam](sam@binary.builders) and we will schedule a call to discuss the feature request. 


## Q1

### Storage
 
* [ ] [Produce a spec for the new store design](https://github.com/cosmos/cosmos-sdk/issues/12986)
    * Research a new design for store. This could entail writing some POC's in order to identify design patterns
* [x] Store as its own go module 
    * Store module should be its own go.mod without a dependency on the Cosmos SDK
* [ ] [Begin implementation of store v2](https://github.com/cosmos/cosmos-sdk/pull/15028)
    * Identify the migration path from store v1 -> store v2
* [ ] Parallel execution of state
    * RFC/ADR is merged into the main on the sdk
* [ ] Optimistic execution
    * RFC/ADR is merged into main on the sdk


### Client UX

* [x] Release v1 of query support (auto-cli) 
    * A version of query support has been merged, documentation is missing
* Dynamic metadata support 
    * Dynamic support allows the Cosmos SDK to release a cmd line tool that could work with any chain. 
    * Add metadata support to latest version of Cosmos SDK and, if possible, backport to older versions
* [x] Multi-chain command **(Done)**
    * Release a cmd line tool that can be pointed a grpc endpoint which then can produce cmd lines to interact with the chain
* [x] Auto-cli tx support 
    * Tx support for auto-cli/hubl
        * This would fully remove the need for application developers to write cli commands for their modules
* [ ] [Consensus Key Rotation](https://github.com/cosmos/cosmos-sdk/issues/5231)


### Dev UX

* [ ] [Release collections v1](https://github.com/cosmos/cosmos-sdk/issues/14300) 
    * Collections is a new abstraction layer similar to the ORM. In the ADR phase it received support from many in the ecosystem. 
    * V1 release should allow modules to be migrated to collections.  
    * Migrate 3 modules to use collections api
        *  Migrating 3 modules to use collections would help in show users how to migrate users
* [ ] [Release ORM v1](https://github.com/cosmos/cosmos-sdk/issues/11088)
* [ ] [Sign mode textual](https://github.com/cosmos/cosmos-sdk/issues/11970) 
    * Sign mode textual has been under construction for 2 quarters now, this quarter the goal is to move towards v1 and potentially line up a audit before final release.
* Core API
    * [x] [Merge ADR for Core API](https://github.com/cosmos/cosmos-sdk/blob/main/docs/architecture/adr-063-core-module-api.md) 
    * Migrate three modules to use core api
* [ ] Module Dependency 
    * [x] Give three modules their own go.mods 
    * Cleanup dependency graph (dependent on integration testing framework)
* [ ] [Metamask signing directly into the sdk](https://github.com/cosmos/cosmos-sdk/discussions/13892) 
* [ ] [ADR-033 (internal message routing)](https://github.com/cosmos/cosmos-sdk/blob/main/docs/architecture/adr-033-protobuf-inter-module-comm.md)
    * Merge internal message router
    * Add docs on how to use the router
* [x] [ADR-54 (dependency management)](https://github.com/cosmos/cosmos-sdk/pull/11802)
    * Come to consensus on module dependency graph for the future
    * Begin socializing conventions 
* [ ] [Remove global bech32](https://github.com/cosmos/cosmos-sdk/issues/13140) 
* [ ] [Auth module](https://github.com/cosmos/cosmos-sdk/issues/14900)
    * Produce a spec/ADR on a proposed new auth module. 
* [x] [Implement Amino Json encoder](https://github.com/cosmos/cosmos-sdk/issues/10993)

### Testing

* [ ] [integration testing framework](https://github.com/cosmos/cosmos-sdk/issues/14145) 
    * design and merge a integration testing framework. 
    * The goals of the framework would that a module only needs to depend on modules that it depends on outside of testing, not all modules in the sdk like today.


### ABCI 2.0

Issue: https://github.com/cosmos/cosmos-sdk/issues/12272

* [ ] [ADR ABCI 2.0](https://github.com/cosmos/cosmos-sdk/issues/14674)
    * Write ADR for integration of vote extensions & finalize block

**Blocked**:

> once cometBFT has a release candidate of ABCI 2.0 (cmt 0.38)

* Integrate ABCI 2.0

### Security

* [ ] [Circuit breaker](https://github.com/cosmos/cosmos-sdk/issues/14226)
    * Implement the circuit breaker module and prepare releases for Cosmos SDK versions 0.45, 0.46 and 0.47


### IAVL

* [x] [ADR 001](https://github.com/cosmos/iavl/pull/608) 
    * Implementation has been completed, waiting on reviewers
* [x] [Prepare the migration path](https://github.com/cosmos/iavl/issues/675) 
    * Migration path has not been finalized
* [ ] Test on mainnets 
    * If possible we would like to test the new IAVL design on mainnets to observer behavior changes. 

Issue: https://github.com/cosmos/iavl/issues/548

## Q2

### Storage

* Completion of Storage v2
    * Goal is to complete the rewrite storage
    * Begin testing the rewrite on mainnets if possible
    * External Audit
* Optimistic Execution spec is merged and implementation has begun
    * Goal is to have the spec merged and implementation started. 
* Store Design should enable parallel execution of transactions. 
    * Goal is to enable it but it may still require some work to complete it

### Client UX

* Add signing support to hubl
    * Signing support is added to hubl
    * Potentially integrating keystone (coordinate with Zondax)

### Dev UX

* Toolkit/SDK ADR. 
    * Come to consensus on how to make the sdk composable 
* Adopt core api fully in modules
    * Goal is to remove the Cosmos SDK and Comet as a dependency from all modules
    * Release v1 of modules that have their dependency graph cleaned up

### ABCI 2.0

**Blocked**:

> once cometBFT has a release candidate of ABCI 2.0 (cmt 0.38)

* Integrate ABCI 2.0

### Modules

* Governance
    * Make gov and groups composable with each other, not duplicate
* Staking
    * Research a new staking design
    * Begin Implementation
* Auth/Accounts v2
    * Spec is merged 
    * Implementation is completed
    * External Audit

### Research

* Feemarket Abstractions
    * Spec on how to abstract fee markets to allow applications to write complex fee markets

## Q3

### Storage

* Audit & release of storage refactor
* Identify further optimizations for storage
    * Goal is to identify the next bottlenecks in storage or the state machine

### Dev UX

* Complete Toolkit/SDK implementation refactor
    * Goal is to release the new version of the sdk allowing for further composability 
* Implement fee market abstractions 
    * Goal is to release an alpha version of fee market abstractions

### Modules

* Staking
    * Complete staking redesign 
    * External Audit 


### Research

* Nonce Lanes
    * Goal is to produce a spec and/or viability of using lanes for nonces instead of a single sequence number. 
* Merklization 
    * Research different trees and commitment structures

## Q4

### Research

* Stateless clients
    * research how stateless clients could evolve in cosmos




This document will be updated at the end of the quarter on what was achieved and what was not. Shortly before the quarter concludes a new section will be added for the next quarter. We are working on updating the complete one year roadmap and will be posting it here as well. 
